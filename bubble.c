#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main(void){
    srand(time(NULL));
    int n;
    int *p;
    printf("Enter Array Size:\n");
    scanf("%i",&n);
    p=malloc(n*sizeof(int));
    printf("-----------Array---------------\n");
    for(int x=0;x<n;x++){
        p[x]=rand()%100;
        printf("[%i]",p[x]);
    }
    printf("\n-------------------------\n");
    for(int u=0;u<n-1;u++){
        for(int i=0;i<n-1-u;i++){
            if(p[i]>p[i+1]){
                int temp;
               temp=p[i];
               p[i]=p[i+1];
               p[i+1]=temp;
        }
    }
    }
    printf("\n----------Array in order----------\n");
    for(int y=0;y<n;y++){
        printf("[%i]",p[y]);
    }
    printf("\n----------------------------------------\n");
    free(p);
    return 0;
}