import java.io.IOException;
import java.util.*;

public class DQUERY {
    public static void main(String[] args) throws IOException {
        Reader r = new Reader();
        int n = r.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = r.nextInt();
        }
        int q = r.nextInt();
        int ans[] = new int[q];
        Query[] queries = new Query[q];
        int blockSize = (int) Math.floor(Math.sqrt(n));
        while (q > 0) {
            int x = r.nextInt() - 1;
            int y = r.nextInt() - 1;
            int index = queries.length - q;
            int block = x / blockSize;
            Query query = new Query(x, y, block, index);
            int i = index - 1;
            while (i >= 0 && queries[i].greaterThan(query)) {
                queries[i + 1] = queries[i];
                i--;
            }
            queries[i + 1] = query;
            q--;
        }

        int freq[] = new int[1000001];
        processQueries(freq, arr, queries, ans);
        for (int i = 0; i < queries.length; i++) {
            System.out.println(ans[i]);
        }
    }


        /*int l = queries[0].l;
        int r = queries[0].r;
        int count = 0;
        for (int i = l; i <= r; i++) {
            if (freq[arr[i]]++ == 0)
                count++;
        }*/
        /*for (int i = l; i <= r; i++) {
            if(freq[arr[i]]++==0)
                count++;
        }

        for (int i = 0; i < queries.length; i++) {
            int qL = queries[i].l;
            int qR = queries[i].r;

            if (qL < l) {
                if (qR < l) {
                    count=0;
                    for (int j = l; j <= r; j++) {
                        freq[arr[j]]--;
                    }
                    for (int j = qL; j <= qR; j++) {
                        if(freq[arr[j]]++==0)
                            count++;
                    }
                } else {
                    for (int j = qL; j < l; j++) {
                        if(freq[arr[j]]++==0)
                            count++;
                    }
                    if (qR < r) {
                        for (int j = r; j > qR; j--) {
                            if (--freq[arr[j]] == 0)
                                count--;
                        }
                    } else {
                        for (int j = r + 1; j <= qR; j++) {
                            if(freq[arr[j]]++==0)
                                count++;
                        }
                    }
                }
            } else {
                if (qL > r) {
                    count=0;
                    for (int j = l; j <= r; j++) {
                        freq[arr[j]]--;
                    }
                    for (int j = qL; j <= qR; j++) {
                        if(freq[arr[j]]++==0)
                            count++;
                    }
                } else {
                    for (int j = l; j < qL; j++) {
                        if (--freq[arr[j]] == 0)
                            count--;
                    }
                    if (qR < r) {
                        for (int j = r; j > qR; j--) {
                            if (--freq[arr[j]] == 0)
                                count--;
                        }
                    } else {
                        for (int j = r + 1; j <= qR; j++) {
                            if(freq[arr[j]]++==0)
                                count++;
                        }
                    }
                }
            }
            l = qL;
            r = qR;
            ans[queries[i].index] = count;
        }*/

        /*for (int i = 0; i < queries.length; i++) {
            Query query = queries[i];
            int qL = query.l;
            int qR = query.r;

            while (--l >= qL) {
                if (++freq[arr[l]] == 1) {
                    count++;
                }
            }
            l++;

            while (l < qL) {
                if (--freq[arr[l]] == 0) {
                    count--;
                }
                l++;
            }

            l = qL;

            while (++r <= qR) {
                if (++freq[arr[r]] == 1) {
                    count++;
                }
            }
            r--;

            while (r > qR) {
                if (--freq[arr[r]] == 0) {
                    count--;
                }
                r--;
            }
            r = qR;
            ans[query.index] = count;
        }*/
        private static void processQueries(int[] freq, int[] arr, Query[] queries, int ans[]) {
        int l = 0;
        int r = -1;
        int count = 0;

        for (int i = 0; i < queries.length; i++) {
            Query query = queries[i];
            int qL = query.l;
            int qR = query.r;

            //extending range
            while(qL<l){
                l--;
                if(++freq[arr[l]]==1)
                    count++;
            }

            while(qR>r){
                r++;
                if(++freq[arr[r]]==1)
                    count++;
            }

            //reducing range
            while(l<qL){
                if(--freq[arr[l]]==0)
                    count--;
                l++;
            }

            while(r>qR){
                if(--freq[arr[r]]==0)
                    count--;
                r--;
            }
            ans[queries[i].index]=count;

        }



    }
}

class Query {
    int l;
    int r;
    int block;
    int index;

    public Query(int l, int r, int block, int index) {
        this.l = l;
        this.r = r;
        this.block = block;
        this.index = index;
    }

    public boolean greaterThan(Query query) {
        if (this.block > query.block) {
            return true;
        } else if (this.block == query.block) {
            if (this.r > query.r) {
                return true;
            }
        }
        return false;
    }
}