public class Selection {
    public static void sort(Comparable[] a)
    {
        int len = a.length;
        for (int i = 1; i < len; ++i) {
            for (int j = i; j > 0 && less(a[j], a[j-1]); --j)
                exch(a, j, j-1);
        }
    }

    public static void sort_R(Comparable[] a)
    {
        int len = a.length;
        for (int i = 1; i < len; ++i) {
            Comparable v = a[i];
            for (int j = i - 1; j > 0 && less(a[j], v); --j)
                a[j+1] = a[j];
            a[j+1] = v;
        }
    }

    private static boolean less(Comparable v, Comparable w)
    { return v.compareTo(w) < 0; }

    private static void exch(Comparable[] a, int i, int j)
    { Comparable tmp = a[i]; a[i] = a[j]; a[j] = tmp; }

    private static void show(Comparable[] a)
    { 
        for (int i = 0; i < a.length; ++i) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static boolean isSorted(Comparable[] a)
    {
        for (int i = 1; i < a.length; ++i)
            if (less(a[i], a[i-1])) return false;
        return true;
    }
}
