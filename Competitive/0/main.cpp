#include <iostream>

using namespace std;

void pulkit(int num, int den)
{
	if (num == 0 || den == 0)
		{
		    cout << "Not a valid fraction";
		    return;
        }

	if (den%num == 0)
	{
		cout << "1/" << den/num;
		return;
	}

	if (num%den == 0)
	{
		cout << num/den;
		return;
	}

	if (num > den)
	{
		cout << num/den << " + ";
		pulkit(num%den, den);
		return;
	}

	int n = den/num + 1;
	cout << "1/" << n << " + ";

	pulkit(num*n-den, den*n);
}

int main()
{
	int num, den;
	cout << "Enter the Numerator" << endl;
	cin >> num;
	cout << "Enter the denominator" << endl;
	cin >> den;
	cout << "The Egyptian Fraction Representation for " << num << "/" << den << " is " << endl;
	pulkit(num, den);
	return 0;
}
