import numpy as np
import matplotlib.pyplot as plt
#first  graph
x = np.arange(0,1,0.01) #od 0 do 1 co 0,01 razy
y = np.sin(2 * np.pi * x * 5)

plt.subplot(2,1,1)
plt.xlabel("Time[s]")
plt.ylabel("Amplituda")
plt.title("Sine Signal")
plt.plot(x,y,"r", label="5 hz")
plt.grid(True)
plt.legend()

#second graph
plt.subplot(2,1,2)

plt.xlabel("Time[s]")
plt.ylabel("Amplituda")
plt.title("Signal with 3 freuquencies")
x = np.arange(0,1,0.01)
y1 = np.sin(2 * np.pi * x * 5)
y2 = np.sin(2 * np.pi * x * 15)
y3 = np.sin(2 * np.pi * x * 30)
y= y1+y2+y3
plt.plot(x,y, "y", label="5, 15 and 30 hz" )
plt.grid(True)
plt.legend()


plt.tight_layout()
plt.show()

