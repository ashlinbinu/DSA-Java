class Solution {
    public boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {
        // //case 1 when edge inside
        // if((xCenter-x1)*(xCenter-x1)+(yCenter-y1)*(yCenter-y1) <=radius*radius ||(xCenter-x1)*(xCenter-x1)+(yCenter-y2)*(yCenter-y2) <=radius*radius || (xCenter-x2)*(xCenter-x2)+(yCenter-y1)*(yCenter-y1) <=radius*radius || (xCenter-x2)*(xCenter-x2)+(yCenter-y2)*(yCenter-y2) <=radius*radius)
        // {
        //     return true;
        // }

        // // case 2 edge outside but area inside
        // if(((xCenter-x1)*(xCenter-x1) <=radius*radius) ||((xCenter-x2)*(xCenter-x2) <=radius*radius) || ((yCenter-y1)*(yCenter-y1) <=radius*radius) || (yCenter-y2)*(yCenter-y2) <=radius*radius)
        // {
        //     return true;
        // }
       
        int xclosest = Math.max(x1,Math.min(x2,xCenter));
        int yclosest = Math.max(y1,Math.min(y2,yCenter));

        if((xCenter-xclosest)*(xCenter-xclosest)+(yCenter-yclosest)*(yCenter-yclosest) <=radius*radius){return true;}
         return false;
    }
}