# CMAKE generated file: DO NOT EDIT!
# Generated by "Unix Makefiles" Generator, CMake Version 3.15

# Delete rule output on recipe failure.
.DELETE_ON_ERROR:


#=============================================================================
# Special targets provided by cmake.

# Disable implicit rules so canonical targets will work.
.SUFFIXES:


# Remove some rules from gmake that .SUFFIXES does not remove.
SUFFIXES =

.SUFFIXES: .hpux_make_needs_suffix_list


# Suppress display of executed commands.
$(VERBOSE).SILENT:


# A target that is always out of date.
cmake_force:

.PHONY : cmake_force

#=============================================================================
# Set environment variables for the build.

# The shell in which to execute make rules.
SHELL = /bin/sh

# The CMake executable.
CMAKE_COMMAND = /Applications/CLion.app/Contents/bin/cmake/mac/bin/cmake

# The command to remove a file.
RM = /Applications/CLion.app/Contents/bin/cmake/mac/bin/cmake -E remove -f

# Escaping for special characters.
EQUALS = =

# The top-level source directory on which CMake was run.
CMAKE_SOURCE_DIR = "/Users/silverman/Documents/SNU/19-2 컴퓨터프로그래밍 이영기/Lab/Lab10"

# The top-level build directory on which CMake was run.
CMAKE_BINARY_DIR = "/Users/silverman/Documents/SNU/19-2 컴퓨터프로그래밍 이영기/Lab/Lab10/cmake-build-debug"

# Include any dependencies generated for this target.
include CMakeFiles/Lab10.dir/depend.make

# Include the progress variables for this target.
include CMakeFiles/Lab10.dir/progress.make

# Include the compile flags for this target's objects.
include CMakeFiles/Lab10.dir/flags.make

CMakeFiles/Lab10.dir/main.cpp.o: CMakeFiles/Lab10.dir/flags.make
CMakeFiles/Lab10.dir/main.cpp.o: ../main.cpp
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir="/Users/silverman/Documents/SNU/19-2 컴퓨터프로그래밍 이영기/Lab/Lab10/cmake-build-debug/CMakeFiles" --progress-num=$(CMAKE_PROGRESS_1) "Building CXX object CMakeFiles/Lab10.dir/main.cpp.o"
	/Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/c++  $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -o CMakeFiles/Lab10.dir/main.cpp.o -c "/Users/silverman/Documents/SNU/19-2 컴퓨터프로그래밍 이영기/Lab/Lab10/main.cpp"

CMakeFiles/Lab10.dir/main.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/Lab10.dir/main.cpp.i"
	/Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -E "/Users/silverman/Documents/SNU/19-2 컴퓨터프로그래밍 이영기/Lab/Lab10/main.cpp" > CMakeFiles/Lab10.dir/main.cpp.i

CMakeFiles/Lab10.dir/main.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/Lab10.dir/main.cpp.s"
	/Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -S "/Users/silverman/Documents/SNU/19-2 컴퓨터프로그래밍 이영기/Lab/Lab10/main.cpp" -o CMakeFiles/Lab10.dir/main.cpp.s

# Object files for target Lab10
Lab10_OBJECTS = \
"CMakeFiles/Lab10.dir/main.cpp.o"

# External object files for target Lab10
Lab10_EXTERNAL_OBJECTS =

Lab10: CMakeFiles/Lab10.dir/main.cpp.o
Lab10: CMakeFiles/Lab10.dir/build.make
Lab10: CMakeFiles/Lab10.dir/link.txt
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --bold --progress-dir="/Users/silverman/Documents/SNU/19-2 컴퓨터프로그래밍 이영기/Lab/Lab10/cmake-build-debug/CMakeFiles" --progress-num=$(CMAKE_PROGRESS_2) "Linking CXX executable Lab10"
	$(CMAKE_COMMAND) -E cmake_link_script CMakeFiles/Lab10.dir/link.txt --verbose=$(VERBOSE)

# Rule to build all files generated by this target.
CMakeFiles/Lab10.dir/build: Lab10

.PHONY : CMakeFiles/Lab10.dir/build

CMakeFiles/Lab10.dir/clean:
	$(CMAKE_COMMAND) -P CMakeFiles/Lab10.dir/cmake_clean.cmake
.PHONY : CMakeFiles/Lab10.dir/clean

CMakeFiles/Lab10.dir/depend:
	cd "/Users/silverman/Documents/SNU/19-2 컴퓨터프로그래밍 이영기/Lab/Lab10/cmake-build-debug" && $(CMAKE_COMMAND) -E cmake_depends "Unix Makefiles" "/Users/silverman/Documents/SNU/19-2 컴퓨터프로그래밍 이영기/Lab/Lab10" "/Users/silverman/Documents/SNU/19-2 컴퓨터프로그래밍 이영기/Lab/Lab10" "/Users/silverman/Documents/SNU/19-2 컴퓨터프로그래밍 이영기/Lab/Lab10/cmake-build-debug" "/Users/silverman/Documents/SNU/19-2 컴퓨터프로그래밍 이영기/Lab/Lab10/cmake-build-debug" "/Users/silverman/Documents/SNU/19-2 컴퓨터프로그래밍 이영기/Lab/Lab10/cmake-build-debug/CMakeFiles/Lab10.dir/DependInfo.cmake" --color=$(COLOR)
.PHONY : CMakeFiles/Lab10.dir/depend

