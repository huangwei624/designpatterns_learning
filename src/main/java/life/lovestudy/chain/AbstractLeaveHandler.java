package life.lovestudy.chain;

/**
 * Create by huangwei on 2020/5/20 0020
 */
abstract public class AbstractLeaveHandler {
    // 最少离开天数， 主管处理
    protected final int MIN_LEAVE_DAY = 3;
    // 最大离开天数， 总经理
    protected final int MAX_LEAVE_DAY = 30;
    // 离开天数中间值， 部门经理
    protected final int MIDDLE_LEAVE_DAY = 7;
    /**
     * 处理请求
     */
    abstract protected void handlerLeaveRequest(LeaveRequest leaveRequest);
}
