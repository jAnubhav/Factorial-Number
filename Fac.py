def factorial(num):
    fac = 1
    for i in range(1, num+1):
        fac *= i
    return fac

if __name__ == "__main__":
    num = int(input("Enter a number : "))
    fac = factorial(num)
    print("Factorial of the number is", fac)
