//
//  Quiz1065.c
//  CodingTest
//
//  Created by Yeahwon Do on 16/08/2020
/*
#include <stdio.h>

int main(){
    int n;
    int ttl = 0;
    int num[4] = {0};
    int i;
    
    scanf("%d", &n);
    
    for (i=1; i<=n; i++){
        num[0] = i/1000;
        num[1] = (i%1000)/100;
        num[2] = (i%100)/10;
        num[3] = i%10;
        
        if (num[0] == 1){
            break;
        }
        else if ((num[0] == 0) && (num[1] == 0)){
            ttl +=1;
        }
        else {
            if ((num[3]-num[2] == num[2]-num[1])){
                ttl +=1;
            }
        }
    }
    
    printf("%d", ttl);
    return 0;
}*/
