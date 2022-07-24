#include <stdio.h>
struct Box
{
    int length, width, height;
};

int volume(struct Box box)
{
    return box.length*box.width*box.height;
}

int lower(struct Box box, int maxHeight)
{
    return box.height < maxHeight;
}

int main()
{
   int n;
   scanf("%d", &n);
   struct Box boxes[100];
   for (int i = 0; i < n; i++)
      scanf("%d%d%d", &boxes[i].length, &boxes[i].width, &boxes[i].height);
   for (int i = 0; i < n; i++)
      if (lower(boxes[i], 41))
         printf("%d\n", volume(boxes[i]));
   return 0;
}
