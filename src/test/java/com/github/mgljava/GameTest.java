package com.github.mgljava;

import static org.junit.Assert.assertEquals;

import com.github.mgl.guessnumber.Answer;
import com.github.mgl.guessnumber.Game;
import org.junit.Test;

public class GameTest {

  @Test
  public void should_return_0A0B_when_no_number_match() {
    // given
    Answer actualAnswer = Answer.createAnswer("1 2 3 4");
    Game game = new Game(actualAnswer);
    Answer inputAnswer = Answer.createAnswer("5 6 7 8");

    // when
    String result = game.guess(inputAnswer);

    // then
    assertEquals(result, "0A0B");
  }
}
