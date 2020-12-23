#include<iostream>
/*
 *
 *  1020304017018019020
    **50607014015016
    ****809012013
    ******10011
 */
int main()
{
	unsigned n=0,last=0,subtractor=0,remember=1;
	std::cout<<"Enter n: ";
	std::cin>>n;
	subtractor=n-1;
	const unsigned limit=n;
	last=n*(n+1);
	for(unsigned x=0;x<limit;x++){
		if(x)
			for(unsigned star=0;star<=x;star++)
				std::cout<<'*';
		for(unsigned ordered=0;ordered<n;ordered++){
			std::cout<<remember++;
			if(remember%10 && x+1!=limit && ordered+1!=n)
				std::cout<<'0';
		}
		std::cout<<'0';
		for(unsigned reverse=0;reverse<n;reverse++){
			std::cout<<last-subtractor;
			if(last-subtractor--%10 && x+1!=limit && reverse+1!=n)
				std::cout<<'0';
		}
		last-=n;
		subtractor=n-2;
		--n;
		std::cout<<std::endl;
	}
	return 0;
}
