package life.lovestudy.chain;

/**
 * Create by huangwei on 2020/5/20 0020
 */
public class Main {
    public static void main(String[] args) {
        LeaveRequest leaveRequest = new LeaveRequest(40, "张三");
        SupervisorHandler supervisorHandler = new SupervisorHandler("主管");
        DepartmentManagerHandler departmentManagerHandler = new DepartmentManagerHandler("部门经理");
        GeneralManagerHandler generalManagerHandler = new GeneralManagerHandler("总经理");
        supervisorHandler.setNextLeaveHandler(departmentManagerHandler);
        departmentManagerHandler.setNextLeaveHandler(generalManagerHandler);

        supervisorHandler.handlerLeaveRequest(leaveRequest);
    }
}
