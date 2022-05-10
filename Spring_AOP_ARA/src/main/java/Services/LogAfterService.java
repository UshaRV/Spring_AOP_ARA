package Services;

import java.lang.reflect.Method;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.aop.AfterReturningAdvice;

import Business.Bank;

public class LogAfterService implements AfterReturningAdvice {

	public void afterReturning(Object ret, Method m, Object[] args, Object o) throws Throwable {
		// TODO Auto-generated method stub

		Log l = LogFactory.getLog(Bank.class);
		l.info("Deposit Method...." + ret);

	}

}
