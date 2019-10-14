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
