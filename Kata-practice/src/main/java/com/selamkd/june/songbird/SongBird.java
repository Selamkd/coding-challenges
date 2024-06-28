package com.selamkd.june.songbird;

public class SongBird {
  private Bird[] birds;
  private Branch[] branches;


  public SongBird(Bird[] birds, Branch[] branches){
      this.birds = birds;
      this.branches = branches;
  }
   /*

    A23 - 1
    1A3 - 2
    12A - 3
    B23 - 4
    1B3 - 5
    12B - 6
    C23 - 7
    1C3 - 8
    12C - 9
    AB3 - 10
    1AB - 11
    A2B - 12
    BA3 - 13



    */

    public static int  getSongBirdCount(Bird[] birds){
      int countSongs = 0;
      if(birds.length == 0  ){
          return 0;
      }

      for(int i = 0; i < birds.length; i ++){
          countSongs++;
      }
       return countSongs;
    }



}
