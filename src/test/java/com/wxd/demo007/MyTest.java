package com.wxd.demo007;

import com.googlecode.aviator.AviatorEvaluator;
import com.googlecode.aviator.Expression;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wangxudong
 * @title: MyTest
 * @projectName demo007
 * @description: TODO
 * @date 2022/10/1317:53
 */
public class MyTest {
    public static void main(String[] args) {
            String expression = "a-(b-c)>100";
            // 编译表达式
            Expression compiledExp = AviatorEvaluator.compile(expression);

            Map<String, Object> env = new HashMap<String, Object>();
            env.put("a", 100.3);
            env.put("b", 45);
            env.put("c", -199.100);

            // 执行表达式
            Boolean result = (Boolean) compiledExp.execute(env);
            System.out.println(result);


        // exec执行方式，无需传递Map格式
        String age = "18";
        System.out.println(AviatorEvaluator.exec("'His age is '+ age +'!'", age));

        // execute执行方式，需传递Map格式
        Map map = new HashMap();
        map.put("age", "18");
        System.out.println(AviatorEvaluator.execute("'His age is '+ age +'!'", map));
        }
}
