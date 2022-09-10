package 제네릭스터디;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GenericListTest {
    private GenericList genericList = new GenericList();
    private NonGenericList nonGenericList = new NonGenericList();

    @Test
    public void 제네릭_리스트에String삽입후가져오기테스트() {
        String mockStr = "문자열1";
        genericList.addString(mockStr);

        String str = genericList.getString(0);
        assertEquals(str, mockStr);
    }

    @Test
    public void 제네릭_리스트에Integer삽입후가져오기테스트() {
        Integer mockInt = 1;
        //genericList.addString(mockInt); //컴파일 타임에 오류 감지

        String str = genericList.getString(0);
        assertEquals(str, mockInt);
    }

    @Test
    public void 비제네릭_리스트에String삽입후가져오기테스트() {
        String mockStr = "문자열1";
        nonGenericList.addString(mockStr);

        String str = nonGenericList.getString(0);
        assertEquals(str, mockStr);
    }

    @Test
    public void 비제네릭_리스트에Integer삽입후가져오기테스트() {
        Integer mockInt = 1;
        nonGenericList.addString(mockInt); //컴파일 타임에 오류 감지 못함

        String str = nonGenericList.getString(0);

        Assertions.assertThrows(ClassCastException.class, () -> {
            String obj = nonGenericList.getString(0);
        });
    }
}
