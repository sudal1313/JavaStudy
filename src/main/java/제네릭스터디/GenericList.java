package 제네릭스터디;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class GenericList {
    private List<String> list = new ArrayList<>();

    public void addString(String str) {
        list.add(str);
    }

    public String getString(int index) {
        return list.get(index);
    }
}
