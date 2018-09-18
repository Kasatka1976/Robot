package spring.start;

import spring.impls.sony.SonyHand;
import spring.impls.sony.SonyHead;
import spring.impls.toschiba.ToschibaLeg;

public class RobotManager {
    public static void main(String[] args) {
        SonyHand sonyHand = new SonyHand();
        ToschibaLeg toschibaLeg = new ToschibaLeg();
        SonyHead sonyHead = new SonyHead();
        Robot robot = new Robot(sonyHand, toschibaLeg, sonyHead);
        robot.action();
    }
}
