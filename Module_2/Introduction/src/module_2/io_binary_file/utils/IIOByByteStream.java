package module_2.io_binary_file.utils;

import java.util.List;

public interface IIOByByteStream<O> {

    List<O> readByByteStream(String path);

    void writeByByteStream(String path, List<O> data);
}
