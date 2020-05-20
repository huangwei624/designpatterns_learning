package life.lovestudy.chain;

/**
 * Create by huangwei on 2020/5/20 0020
 */
public class GeneralManagerHandler extends AbstractLeaveHandler {
    private String name;

    private AbstractLeaveHandler nextLeaveHandler;

    public GeneralManagerHandler(String name) {
        this.name = name;
    }

    /**
     * 总经理处理请求
     */
    @Override
    protected void handlerLeaveRequest(LeaveRequest leaveRequest) {
        // 如果请假天数小于30天 大于7天
        if(leaveRequest.getLeaveDay() <= this.MAX_LEAVE_DAY && leaveRequest.getLeaveDay() > this.MIDDLE_LEAVE_DAY){
            System.out.println(name + "已经对"+ leaveRequest.getName() +"批假，");
            return;
        }
        if(this.nextLeaveHandler != null){
            this.nextLeaveHandler.handlerLeaveRequest(leaveRequest);
        }else {
            System.out.println("拒绝处理，");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AbstractLeaveHandler getNextLeaveHandler() {
        return nextLeaveHandler;
    }

    public void setNextLeaveHandler(AbstractLeaveHandler nextLeaveHandler) {
        this.nextLeaveHandler = nextLeaveHandler;
    }
}
