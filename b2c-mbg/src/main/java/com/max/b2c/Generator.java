package com.max.b2c;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class Generator  {
    public static void main(String[] args) throws Exception{
        List<String> warnings = new ArrayList<String>();
        //当生成的代码重复时，覆盖原代码
        boolean overwrite = true;
        //读取我们的 MBG 配置文件
        InputStream is = Generator.class.getResourceAsStream("/generatorConfig.xml");

        ConfigurationParser cp = new ConfigurationParser(warnings);
        DefaultShellCallback shellCallback = new DefaultShellCallback(overwrite);
        Configuration configuration = null;
        try {
            configuration = cp.parseConfiguration(is);
            is.close();
            //创建MBG
            MyBatisGenerator myBatisGenerator = new MyBatisGenerator(configuration, shellCallback, warnings);
            //执行生成代码
            myBatisGenerator.generate(null);
        } catch (Exception e) {
            e.printStackTrace();
        }

        for(String warning : warnings) {
            System.out.println(warning);
        }
    }
}
