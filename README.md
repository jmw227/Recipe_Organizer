# Recipe_Organizer
Personal Recipe Organizer/Grocery List Maker project

basic file input/output.

File Format example found in beefstew_ingred.txt and beefstew_proc.txt

Plan:
  GUI - most likely in swing
  
  compression of files -either a Huffman tree or a Lemple Ziv Welsh(LZW) method for compression
  
  searching - since there is not going to be any sort of database, this will simply just add the 
              take the searched recipe name, check if there is a _ingred.txt and _proc.txt file
              within the directory and if so, use them. May be updated in the future as more features
              are fleshed out.
              (Possibility: create a file that holds all recipe names, check this for existance/searching
               using a tree/trie potentiallyFaster/Not?- probably not faster than file check, but could be interesting
               implementation/datastructure practice)
               
  Adding - Get recipe name, check if it exists
         - if exists, ask if update is wanted
         - if not, get ingredients and procedure
         - immediately write new files
         
  Updating - display current ingredients and procedure, allow for full rewriting
            once button is pushed, immediately update files.
  
  Implementation Process:
    1. Add
    2. Update
    3. Search
    4. GUI Develompent
