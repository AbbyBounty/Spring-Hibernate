package sh.components;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class WindowsCondition implements Condition {
	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		String os = context.getEnvironment().getProperty("os.name");
		return os.toUpperCase().contains("WINDOWS");
	}
}
