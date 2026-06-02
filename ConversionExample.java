public class ConversionExample {
    public static void main(String[] args) {
        
        // ===== 1. String -> StringBuilder =====
        String str = "Hello World";
        StringBuilder sb = new StringBuilder(str);
        StringBuffer sbf = new StringBuffer(str);
        
        System.out.println("=== String -> StringBuilder ===");
        System.out.println("Исходная String: " + str);
        System.out.println("StringBuilder: " + sb);
        System.out.println("StringBuffer: " + sbf);
        
        // ===== 2. StringBuilder -> String =====
        StringBuilder sb2 = new StringBuilder("Java Programming");
        String strFromSb = sb2.toString();
        
        System.out.println("\n=== StringBuilder -> String ===");
        System.out.println("StringBuilder: " + sb2);
        System.out.println("String: " + strFromSb);
        
        // ===== 3. StringBuffer -> String =====
        StringBuffer sbf2 = new StringBuffer("StringBuffer Example");
        String strFromSbf = sbf2.toString();
        
        System.out.println("\n=== StringBuffer -> String ===");
        System.out.println("StringBuffer: " + sbf2);
        System.out.println("String: " + strFromSbf);
        
        // ===== 4. StringBuilder <-> StringBuffer =====
        StringBuilder sb3 = new StringBuilder("Builder");
        StringBuffer sbf3 = new StringBuffer(sb3.toString());
        
        StringBuffer sbf4 = new StringBuffer("Buffer");
        StringBuilder sb4 = new StringBuilder(sbf4.toString());
        
        System.out.println("\n=== StringBuilder <-> StringBuffer ===");
        System.out.println("StringBuilder -> StringBuffer: " + sbf3);
        System.out.println("StringBuffer -> StringBuilder: " + sb4);
        
        // ===== 5. Преобразование с помощью метода append() =====
        System.out.println("\n=== Через append() ===");
        StringBuilder sb5 = new StringBuilder();
        sb5.append("String to ").append(str);
        System.out.println(sb5);
        
        // ===== 6. String + StringBuilder (конкатенация) =====
        String str2 = "Result: " + sb2.toString();
        System.out.println("\n=== Конкатенация с String ===");
        System.out.println(str2);
    }
}