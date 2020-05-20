package life.lovestudy.chain;

/**
 * Create by huangwei on 2020/5/20 0020
 * 员工请假类
 */
public class LeaveRequest {
    // 请假的天数
    private int leaveDay;
    // 请假人的姓名
    private String name;

    public LeaveRequest(int leaveDay, String name) {
        this.leaveDay = leaveDay;
        this.name = name;
    }

    public int getLeaveDay() {
        return leaveDay;
    }

    public void setLeaveDay(int leaveDay) {
        this.leaveDay = leaveDay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
