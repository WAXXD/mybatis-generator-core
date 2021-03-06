### mybatis逆向工具
1. 修改了bean的生成，实现了Serializable接口和serialVersionUID
2. 添加了lombok的注解@Data和@Accessors(chain = true)
3. 给类和字段添加了注释
4. 使用测试类MainTest即可测试，测试前需要修改generatorConfig.xml配置的数据库账号和密码

```java
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * Date: 2021-12-16 17:44:01.
 * Table: data_needs.
 */
@Data
@Accessors(chain = true)
public class DataNeeds implements Serializable {
    /**
     *   Desc: 主键
     *   Column: id
     */
    private Long id;

    /**
     *   Desc: 需求类型
     *   Column: needs_type
     */
    private String needsType;

    private static final long serialVersionUID = 1L;
}
```
