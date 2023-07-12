public class TryCatchFinallySample2 {

    private static Logger logger = Logger.getLogger(TryCatchFinallySample2.class.getName());
    
        public static void main(String[] args) {
            logger.setLevel(Level.ALL);
    
            ① {
                logger.②("①");
                Integer.parseInt(args[0]);
            } ③ (Exception e) {
                logger.④("③");
            } ⑤ {
                logger.⑥("⑤");
            }
        }
    }
    