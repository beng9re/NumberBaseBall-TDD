package nextstep.test.baseball;

import static org.assertj.core.api.Assertions.*;

import baseball.Ball;
import baseball.BaseStatus;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BallTest {
	private Ball com;

	@BeforeEach
	void setUp(){
		com = new Ball(1,4);
	}

	@Test
	void strike() {
		BaseStatus status = com.play(new Ball(1,4));
		assertThat(status).isEqualTo(BaseStatus.STRIKE);
	}

	@Test
	void ball() {
		BaseStatus status = com.play(new Ball(2,4));
		assertThat(status).isEqualTo(BaseStatus.BALL);
	}

	@Test
	void notting() {
		BaseStatus status = com.play(new Ball(2,5));
		assertThat(status).isEqualTo(BaseStatus.NOTHING);
	}

}
