/*
 * Created on 2005/02/15
 *
 */

/**
 * 環境の状態を表すクラス
 * 
 * @author mori
 *  
 */
public class State {
    
    // 上の棒の角度
    public double theta1;
    // 上の棒の角速度
    public double thetaDot1;
    // 下の棒の角度
    public double theta2;
    // 下の棒の角速度
    public double thetaDot2;
    
    public State() {
        this(0.0, 0.0, 0.0, 0.0);
    }

    public State(double theta1, double thetaDot1, double theta2, double thetaDot2) {
        this.theta1 = theta1;
        this.thetaDot1 = thetaDot1;
        this.theta2 = theta2;
        this.thetaDot2 = thetaDot2;
    }

    /**
     * 状態を初期化する
     *
     */
    public void init() {
        theta1 = thetaDot1 = theta2 = thetaDot2 = 0.0;
    }
    
    /**
     * 棒2の先端がバーの上にあるかどうか
     * 
     * @return バーの上にあればtrueを返す
     */
    public boolean isTouchBar() {
        int y2;

        // 足先の座標
        y2 = (int) ((Environment.L1 * 100) * Math.cos(theta1) + (Environment.L2 * 100)
                * Math.cos(theta1 + theta2) + 200);
        if (y2 < Environment.BAR_HEIGHT) {
            return true;
        } else {
            return false;
        }
    }
}