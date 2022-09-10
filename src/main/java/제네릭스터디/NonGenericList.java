package 제네릭스터디;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class NonGenericList {
    public List list = new ArrayList();

    public void addString(Object obj) {
        list.add(obj);
    }

    public String getString(int index) {
        return (String) list.get(index);
    }
}
