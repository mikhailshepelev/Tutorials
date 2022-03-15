package section_9_inner_and_abstract_classes_interfaces.interface_challenge;

import java.util.*;

public interface ISaveable {
    List<String> write();
    void read(List<String> savedValues);
}
