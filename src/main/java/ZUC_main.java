/**
 * @author huzb
 * @version v1.0.0
 * @date 2018/9/8
 */
public class ZUC_main {
    public static void main(String[] arg) {
        int iv[] = { 0x84, 0x31, 0x9a, 0xa8, 0xde, 0x69, 0x15, 0xca, 0x1f, 0x6b, 0xda, 0x6b, 0xfb, 0xd8, 0xc7, 0x66 };
        int key[] = { 0x3d,0x4c,0x4b,0xe9,0x6a,0x82,0xfd,0xae,0xb5,0x8f,0x64,0x1d,0xb1,0x7b,0x45,0x5b };
        int keyStreamSize = 2;

        long[] pKeyStream = new long[keyStreamSize];
        ZUC zuc = new ZUC();
        zuc.Initialization(key, iv);
        zuc.GenerateKeyStream(pKeyStream, keyStreamSize);

        for (int i = 0; i < keyStreamSize; ++i) {
            System.out.printf("%x\n",pKeyStream[i]);
            System.out.println();
        }
    }
}
