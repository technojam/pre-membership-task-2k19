'''
Alphabet Rangoli

  Rangoli is a form of Indian folk art
  based on creation of patterns.
    
    Rangoli of size 3:
    
    ----c----
    --c-b-c--
    c-b-a-b-c
    --c-b-c--
    ----c----
    
  Here's my version of Alphabet Rangoli
  implementation. Have fun and please
  share your comments..
  
  Constraints:
    Enter a natural number n,
    the size of rangoli: 0 < n < 27
  
  Screen size limitations:
    If you run this code on your smartphone,
    the result may become unreadable.
    Please try 0 < n < 11.
'''

err="Please, enter a natural number n<27 and try again..."

try:
    n=int(input())
    assert 0<n<27
except (ValueError, AssertionError):
    print(err)
    exit()

from string import ascii_lowercase

width = 4*n - 3
s = ascii_lowercase[:n]
s = s[::-1] + s[1:]

for c in s:
    pat = s[:s.index(c)]
    pat = '-'.join(pat + c + pat[::-1])
    dashes = (width - len(pat)) // 2 * '-'
    print(dashes + pat + dashes)
