package com.ofg.springbootsandbox;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.ofg.springbootsandbox.model.Song;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootSandboxApplicationTests {

	@Test
	public void songTest() {
		Song song = new Song("Rocket", "Def Leppard", 150);
		System.out.println(song.formattedDuration());
	}

}
