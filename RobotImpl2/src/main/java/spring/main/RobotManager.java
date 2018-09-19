package spring.main;

import spring.impls.sony.SonyHand;
import spring.impls.sony.SonyHead;
import spring.impls.toshiba.ToschibaLeg;

public class RobotManager {
    public static void main(String[] args) {
        SonyHand sonyHand = new SonyHand();
        ToschibaLeg toschibaLeg = new ToschibaLeg();
        SonyHead sonyHead = new SonyHead();
        Robot robot = new Robot(sonyHand, toschibaLeg, sonyHead);
        robot.action();
    }
}
