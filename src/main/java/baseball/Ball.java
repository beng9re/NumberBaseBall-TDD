package baseball;

import java.util.Objects;

public class Ball {

	private final int position;
	private final int balNo;

	public Ball(int position, int balNo){
		this.position = position;
		this.balNo = balNo;

	}

	public BaseStatus play(Ball ball) {
		if(equals(ball)){
			return BaseStatus.STRIKE;
		}
		if(ball.metchBallNo(balNo)) {
			return BaseStatus.BALL;
		}

		return BaseStatus.NOTHING;
	}

	private boolean metchBallNo(int balNo) {
		return this.balNo == balNo;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Ball ball = (Ball) o;
		return position == ball.position && balNo == ball.balNo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(position, balNo);
	}
}
