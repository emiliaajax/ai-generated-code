package ChatGPT.BreadthFirstSearch.T42;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GraphTest {
  @Test
  public void shouldReturnCorrectParentArray() {
    Graph sut = new Graph(6);
    sut.addEdge(0, 1);
    sut.addEdge(0, 2);
    sut.addEdge(1, 3);
    sut.addEdge(2, 3);
    sut.addEdge(3, 4);
    sut.addEdge(3, 5);

    int[] possibility1 = { -1, 0, 0, 1, 3, 3 };
    int[] possibility2 = { -1, 0, 0, 2, 3, 3 };

    boolean expected = true;
    boolean actual = Arrays.equals(sut.bfs(0), possibility1) || Arrays.equals(sut.bfs(0), possibility2);

    assertEquals(expected, actual);
  }
}
