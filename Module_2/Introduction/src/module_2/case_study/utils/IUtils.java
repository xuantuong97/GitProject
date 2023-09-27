package module_2.case_study.utils;

import java.util.List;

public interface IUtils<E> {

    List<String> readFile(String path);

    void writeFile(String path, List<String> data);

    List<String> convertObjectString(List<E> eList);
}
