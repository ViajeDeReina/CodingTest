//
//  Quiz1546.c
//  CodingTest
//
//  Created by Yeahwon Do on 17/08/2020

#include <stdio.h>

int main () {
    
    int n, i, max_score;
    double temp;
    double new_sum = 0.0;
    int *scores;
    
    scanf("%d", &n);
    scores = (int*)malloc(n*sizeof(int));
    
    for (i=0; i<n; i++){
        scanf("%d", &scores[i]);
        getchar();
    }
    
    max_score = scores[0];
    
    for (i = 0; i < n; i++) {
        if (scores[i] > max_score) {
            max_score = scores[i];
        }
    }

    for (i = 0; i < n; i++) {
        temp = ((double)scores[i]/max_score)*100;
        new_sum += temp;
    }
    
    printf("%lf", new_sum/n);
    
    /*for (int i = 0; i < n; i++) {
        free(scores[i]);
    }*/
    
    return 0;
}
