import { Container, Paper } from '@mui/material';
import './login.css';
import './image.jpg'
export default function Example() {
  const paperStyle ={padding : '50px 20px',width:600,margin:"20px auto"}
    return (
      <>
        {/*
          This example requires updating your template:
  
          ```
          <html class="h-full bg-white">
          <body class="h-full">
          ```
        */}
        <flex>
        <div className='flex'>
        <Container clas="md:container md:mx-auto"style={{ marginTop: '100px' }}>
          <Paper elevation={3} style={paperStyle}>
        <div class="md:container md:mx-auto">
        <div className="flex min-h-full flex-1 flex-col justify-center px-6 py-4 lg:px-8">
          <div className="sm:mx-auto sm:w-full sm:max-w-sm">
            <img
              className="mx-auto h-28 w-auto"
              src="https://imgs.search.brave.com/MvQiH5pemGm_4xycHku5JdTIxlRHJxTbuknWUW3SzOU/rs:fit:860:0:0/g:ce/aHR0cHM6Ly91cGxv/YWQud2lraW1lZGlh/Lm9yZy93aWtpcGVk/aWEvZW4vdGh1bWIv/Ny83Ny9CYW5uYXJp/X0FtbWFuX0luc3Rp/dHV0ZV9vZl9UZWNo/bm9sb2d5X2xvZ28u/cG5nLzUxMnB4LUJh/bm5hcmlfQW1tYW5f/SW5zdGl0dXRlX29m/X1RlY2hub2xvZ3lf/bG9nby5wbmc"
              alt="Your Company"
            />
            <h2 className="mt-10 text-center text-2xl font-bold leading-9 tracking-tight text-gray-900">
              Sign in to your account
            </h2>
          </div>
          <div style={{ marginTop: '25px', marginLeft:"94px" }}>
                <button
                  type="submit"
                  className="flex w-80 justify-center rounded-md bg-yellow-500 px-3 py-1.5 text-sm font-semibold leading-6 text-white shadow-sm hover:bg-orange-500 focus-visible:outline focus-visible:outline-2 focus-visible:outline-offset-2 focus-visible:outline-indigo-600"
                >
                  Sign up with google
                </button>
              </div>
              <div style={{ marginTop: '25px',marginLeft:'30px'}}>
        <div className="flex gap-4 items-center px-5 text-sm font-medium tracking-tight leading-6 text-center text-slate-400">
      <div className="shrink-0 self-stretch my-auto h-px border border-solid bg-slate-200 border-slate-200 w-[182px]" />
      <div className="self-stretch">or </div>
      <div className="shrink-0 self-stretch my-auto h-px border border-solid bg-slate-200 border-slate-200 w-[183px]" />
    </div>
    </div>
  
          <div className="mt-10 sm:mx-auto sm:w-full sm:max-w-sm">
            <form className="space-y-6" action="#" method="POST">
              <div>
                <label htmlFor="email" className="block text-sm font-medium leading-6 text-gray-900">
                  Email address
                </label>
                <div className="mt-2">
                  <input
                    id="email"
                    name="email"
                    type="email"
                    autoComplete="email"
                    required
                    className="block w-full rounded-md border-0 py-1.5 text-gray-900 shadow-sm ring-1 ring-inset ring-gray-300 placeholder:text-gray-400 focus:ring-2 focus:ring-inset focus:ring-indigo-600 sm:text-sm sm:leading-6"
                  />
                </div>
              </div>
  
              <div>
                <div className="flex items-center justify-between">
                  <label htmlFor="password" className="block text-sm font-medium leading-6 text-gray-900">
                    Password
                  </label>
                  <div className="text-sm">
                    <a href="#" className="font-semibold text-indigo-600 hover:text-indigo-500">
                      Forgot password?
                    </a>
                  </div>
                </div>
                <div className="mt-2">
                  <input
                    id="password"
                    name="password"
                    type="password"
                    autoComplete="current-password"
                    required
                    className="block w-full rounded-md border-0 py-1.5 text-gray-900 shadow-sm ring-1 ring-inset ring-gray-300 placeholder:text-gray-400 focus:ring-1 focus:ring-inset focus:ring-indigo-700 sm:text-sm sm:leading-7"
                  />
                </div>
              </div>
  
              <div>
                <button
                  type="submit"
                  className="flex w-full justify-center rounded-md bg-indigo-600 px-3 py-1.5 text-sm font-semibold leading-6 text-white shadow-sm hover:bg-indigo-500 focus-visible:outline focus-visible:outline-2 focus-visible:outline-offset-2 focus-visible:outline-indigo-600"
                >
                  Sign in
                </button>
              </div>
            </form>
  
            <p className="mt-10 text-center text-sm text-gray-500">
              Bitsathy{' '}
              <a href="#" className="font-semibold leading-6 text-indigo-600 hover:text-indigo-500">
                @ Bannari Amman Institute of Technology
              </a>
            </p>
          </div>
        </div>
        </div>
        </Paper>
        </Container>
        <img src='image.jpg' className='rounded-l-lg'></img>
        </div>
        </flex>
      </>
    )
  }
  