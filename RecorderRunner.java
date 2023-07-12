public class Recorder {
    private Map<String, String> map = new HashMap<>();
    
        public void put(String key, String value) {
            map.put(key, value);
            System.out.println(key + "=" + value);
        }
        
        public void get(String key) {
            if (!map.⑥(key)) {
                ⑦ new IllegalArgumentException();
            }
        
            System.out.println(map.get(key));
        }
        
        public void delete(String key) {
            if (!map.⑥(key)) {
                ⑦ new IllegalArgumentException();
            }
    
            map.⑧(key);
            System.out.println("deleted: "  + key);
        }
        
        public void delete() {
            map.⑨();
            System.out.println("deleted all");
        }
    }
    ```
    