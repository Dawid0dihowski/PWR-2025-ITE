import numpy as np
import matplotlib.pyplot as plt
#first  graph
step = 1/3000
plt.subplot(2,1,2)
plt.xlabel("Time[s]")
plt.ylabel("Amplituda")
plt.title("Signal with 3 freuquencies")
x = np.arange(0,1,step)
y1 = np.sin(2 * np.pi * x * 5)
y2 = np.sin(2 * np.pi * x * 15)
y3 = np.sin(2 * np.pi * x * 30)
y= y1+y2+y3
plt.plot(x,y, "r", label="5, 15 and 30 hz" )
plt.xlim(0, 1)
plt.grid(True)
plt.legend()

#second graph
plt.subplot(2,1,1)
plt.title("Magnitude Spectrum (DFT)")
plt.xlabel("Frequency [Hz]")
plt.ylabel("Amplitude")

N = len(y)
n = np.arange(N)
k = n.reshape((N, 1))
e = np.exp(-2j * np.pi *((k*n)/N))
Xk = np.dot(e, y)
Mod_Xk = np.sqrt((np.real(Xk))**2 + (np.imag(Xk))**2)

freqs = np.fft.fftfreq(N, step)
polowa = N // 2
freqs_half = freqs[:polowa]
Mod_Xk_half = Mod_Xk[:polowa]

plt.plot(freqs_half,Mod_Xk_half)
plt.xlim(0, 100)
plt.grid(True)
plt.tight_layout()
plt.show()

