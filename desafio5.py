def invert(string):
 
  invert = []
  for i in range((len(string)-1),-1,-1):  
    invert.append(string[i]) 
  return "".join(invert) 


str = input("Digite:")
print(f'{str} invertido é: {invert(str)}')