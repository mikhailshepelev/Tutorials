package section_11_namings_packages_static_final_keywords.packages_demo.com.example.game;

import java.util.List;

public interface ISaveable {
    List<String> write();
    void read(List<String> savedValues);
}
