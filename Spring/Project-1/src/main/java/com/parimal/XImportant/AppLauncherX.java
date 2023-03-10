package com.parimal.XImportant;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.parimal.XImportant")
public class AppLauncherX
{
	public static void main(String[] args)
	{
		try (var ctx = new AnnotationConfigApplicationContext(AppLauncherX.class)) // same class name
		{
			ctx.getBean(GamingConsoleX_I.class).up();
			ctx.getBean(GameRunnerX.class).run();

		}
	}

}
