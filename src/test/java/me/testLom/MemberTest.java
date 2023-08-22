package me.testLom;

import org.junit.Assert;
import org.junit.Test;

public class MemberTest {
    @Test
    public void getterSetter() {
        Member member = new Member();
        member.setName("LOM");

        Assert.assertEquals(member.getName(), "LOM");
    }

}
