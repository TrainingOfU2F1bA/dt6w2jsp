package xin.saul.demo.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import xin.saul.demo.dao.EmployeeDao;
import xin.saul.demo.service.EmployeeService;

import java.util.Arrays;
import java.util.stream.Stream;

@Aspect
@Component
public class EmployeeAspect {
    public static final String EXECUTION_ORG_SPRINGFRAMEWORK_WEB_BIND_ANNOTATION_REQUEST_MAPPING
            = "execution(@(@ org.springframework.web.bind.annotation.RequestMapping *) * *.*(..))";
    public static final String EXECUTION_XIN_SAUL_DEMO_CONTROLLER_EMPLOYEE_CONTROLLER
            = "execution(* xin.saul.demo.controller.EmployeeController.*(..))";
    public static final String EMPLOYEE_CONTROLLER_ASPECT_REQUEST_MAPPING_ASPECT
            = "employeeControllerAspect()&&requestMappingAspect()";
    @Autowired
    EmployeeService employeeService;
    @Autowired
    EmployeeDao employeeDao;

    @Pointcut(EXECUTION_ORG_SPRINGFRAMEWORK_WEB_BIND_ANNOTATION_REQUEST_MAPPING)
    public void requestMappingAspect() {
    }

    @Pointcut(EXECUTION_XIN_SAUL_DEMO_CONTROLLER_EMPLOYEE_CONTROLLER)
    public void employeeControllerAspect() {
    }

    @Around(EMPLOYEE_CONTROLLER_ASPECT_REQUEST_MAPPING_ASPECT)
    public Object serviceCoverController(ProceedingJoinPoint joinPoint) throws Throwable {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        return employeeService.getClass().getDeclaredMethod(
                signature.getName(),
                signature.getParameterTypes()
        ).invoke(
                employeeService, joinPoint.getArgs()
        );
    }
}
