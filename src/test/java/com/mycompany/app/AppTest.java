package com.mycompany.app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
    @Test
    public void testAppConstructor() {
        App app1 = new App();
        App app2 = new App();
        assertEquals(app1.getMessage(), app2.getMessage(),
            "所有 App 实例应返回相同的消息");
    }

    @Test
    public void testAppMessage() {
        App app = new App();
        assertEquals("Hello World!", app.getMessage(),
            "getMessage() 应返回 'Hello World!'");
    }
}
