package collection;


import org.junit.Test;
import org.w3c.dom.ls.LSOutput;

import java.util.Comparator;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertThat;

public class JobTest {

    @Test
    public void whenCompatorByNameDOWN() {
        Comparator<Job> cmpName = new JobDescByName();
        int rsl = cmpName.compare(
                new Job("B", 5),
                new Job("A", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenCompatorByNameUP() {
        Comparator<Job> cmpName = new JobASCByName();
        int rsl = cmpName.compare(
                new Job("B", 5),
                new Job("A", 1)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenCompatorByPriorityUP() {
        Comparator<Job> cmpName = new JobASCByPriority();
        int rsl = cmpName.compare(
                new Job("B", 5),
                new Job("A", 1)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenCompatorByPriorityDOWN() {
        Comparator<Job> cmpName = new JobDescByPriority();
        int rsl = cmpName.compare(
                new Job("B", 5),
                new Job("A", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenDescByNameAndPriority() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("А", 5),
                new Job("B", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenAscByNameAndPriority() {
        Comparator<Job> cmpNamePriority = new JobASCByName().thenComparing(new JobASCByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("B", 5),
                new Job("A", 1)
        );
        assertThat(rsl, greaterThan(0));
    }


}

