public class filaCircular {
    int contAdd=0,contRemove=0,N;
    int vetor[];
    int in=0,out=0;
 
    public filaCircular(int N){
        this.N = N;
        vetor = new int[N];
        for (int i=0;i<N;i++)
        {
            vetor[i] = -1;
        }
    }
 
    public void add(int v){
        in = contAdd%N;
        contAdd ++;
        vetor[in] = v;
    }
 
    public boolean isEmpty()
    {
        int vazios=0;
        for (int i=0;i<N;i++)
        {
            if (vetor[i]== -1)
            {
                vazios++;
            }
        }
        if (vazios == N)
        {
            return true;   
        }
        return false;
    }
 
    public boolean isFull()
    {
        int vazios=0;
        for (int i=0;i<N;i++)
        {
            if (vetor[i]== -1)
            {
                vazios++;
            }
        }
        if(vazios == 0)
        {
            return true;
        }
        return false;
    }

    public int remove()
    {
        if(isEmpty())
        {
            return -1;
        }
        else
        {
            out = contRemove%N;
            contRemove++;
            vetor[out] = -1;
            return 0;
        }
    }

    public void print()
    {
        for(int i=0;i<=N-1;i++)
        {
            System.out.print(vetor[i]+" ");
        }
        System.out.println();
    }

    public int peek(){
        return vetor[out];
    }

    public int peekAdd()//utilizado para verificar o valor substituido no add
    {
        return vetor[contAdd%N];
    }

    public int peekRemove()//utilizado para verificar o valor substituido no remove 
    {
        return vetor[contRemove%N];
    }

    public int getContAdd(){
        return contAdd;
    }
    
    public int getContRemove(){
        return contRemove;
    }

    public int size(){
        return N;
    }

    public void clear()
    {
        for (int i=0;i<N;i++)
        {
            remove();
        }
    }

    public boolean contains(int v)
    {
        for (int i=0;i<N;i++)
        {
            if(vetor[i] == v)
            {
                return true;
            }
        }
        return false;
    }

    public int getIn() {
        return contAdd%N;
    }

    public int getOut() {
        return contRemove%N;
    }
}
