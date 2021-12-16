package com.waxxd;

import org.junit.Test;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * description:
 *
 * @author waxxd
 * @version 1.0
 * @date 2021-12-16
 * @jdkversion since 8
 **/
public class MainTest {

    @Test
    public void test1() throws IOException {
        System.out.println(new File("").getCanonicalPath());
    }

    @Test
    public void test() throws XMLParserException, IOException, InvalidConfigurationException, SQLException,
            InterruptedException {
        List<String> warnings = new ArrayList<String>();
        boolean overwrite = true;
        //指向逆向工程配置文件
        File configFile = new File("generatorConfig.xml");
        System.out.println(configFile.exists());
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(configFile);
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config,
                callback, warnings);
        myBatisGenerator.generate(null);
    }
}
